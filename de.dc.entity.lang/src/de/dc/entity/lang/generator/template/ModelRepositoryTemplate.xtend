package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity
import de.dc.entity.model.Field

class ModelRepositoryTemplate implements IGenerator<Entity>{
	
	override filename(Entity t){
		t.name.toFirstUpper+'Repository'
	}
	
	override gen(Entity t)'''
	package «t.packagePath».repository;
	
	import java.sql.*;
	import «t.packagePath».model.*;
	import java.util.*;
	import java.time.*;
	
	«val name = t.name.toFirstUpper»
	public class «name»Repository extends BaseRepository<«name»>{
	
		@Override
		protected «name» map(ResultSet resultSet) throws SQLException{
			«name» «name.toFirstLower» = new «name»();
			«name.toFirstLower».setId(resultSet.getLong("ID"));
			«FOR field : t.field»
			«IF field.useByRepository»
			«name.toFirstLower».set«field.name.toFirstUpper»(«field.value»);
			«ENDIF»
			«ENDFOR»
			return «name.toFirstLower»;
		}
		
		«FOR field : t.field»
		«IF field.useByRepository»
		«val columnName = field.name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase»
		public void update«field.name.toFirstUpper»(long id, «field.datatype.qualifiedName» «field.name.toFirstLower») {
			queryExecute("UPDATE «name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase» SET «columnName» ='"+«field.name.toFirstLower»+"' WHERE ID = "+id);
		}
		
		public void deleteBy«field.name.toFirstUpper»(«field.datatype.qualifiedName» «field.name.toFirstLower») {
			queryExecute("DELETE «name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase» WHERE «columnName» = '"+«field.name.toFirstLower»+"'");
		}
		
		public List<«name»> findAllBy«field.name.toFirstUpper»(«field.datatype.simpleName» «field.name.toFirstLower»){
			return query(String.format("SELECT * FROM «name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase» WHERE «columnName» = '%s'", String.valueOf(«field.name.toFirstLower»)));
		}

		public List<«name»> findAllBy«field.name.toFirstUpper»OrderByAsc(«field.datatype.simpleName» «field.name.toFirstLower»){
			return query(String.format("SELECT * FROM «name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase» WHERE «columnName» = '%s' ORDER BY «columnName» ASC", String.valueOf(«field.name.toFirstLower»)));
		}

		public List<«name»> findAllBy«field.name.toFirstUpper»OrderByDesc(«field.datatype.simpleName» «field.name.toFirstLower»){
			return query(String.format("SELECT * FROM «name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase» WHERE «columnName» = '%s' ORDER BY «columnName» DESC", String.valueOf(«field.name.toFirstLower»)));
		}

		public List<«name»> findAllBy«field.name.toFirstUpper»Like(«field.datatype.simpleName» «field.name.toFirstLower»){
			return query(String.format("SELECT * FROM «name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase» WHERE «columnName» like '%%s%'", String.valueOf(«field.name.toFirstLower»)));
		}
		
		public List<«name»> findAllBy«field.name.toFirstUpper»LikeOrderByAsc(«field.datatype.simpleName» «field.name.toFirstLower»){
			return query(String.format("SELECT * FROM «name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase» WHERE «columnName» like '%%s%' ORDER BY «columnName» ASC", String.valueOf(«field.name.toFirstLower»)));
		}
		
		public List<«name»> findAllBy«field.name.toFirstUpper»LikeOrderByDesc(«field.datatype.simpleName» «field.name.toFirstLower»){
			return query(String.format("SELECT * FROM «name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase» WHERE «columnName» like '%%s%' ORDER BY «columnName» DESC", String.valueOf(«field.name.toFirstLower»)));
		}
		«ENDIF»
		«ENDFOR»
		
		@Override
		protected String findAllStatement() {
			return «t.name.toFirstUpper»Constant.SQL_FIND_ALL;
		}
		
		@Override
		protected String findByIdStatement(long id) {
			return String.format(«t.name.toFirstUpper»Constant.SQL_FIND_BY_ID, id);
		}
	
		@Override
		protected String saveStatement() {
			return «t.name.toFirstUpper»Constant.SQL_INSERT;
		}
	
		@Override
		protected void prepareStatetmentForSave(«name» t, PreparedStatement statement) throws SQLException {
			«var indexSave = 0»
			«FOR i : 0..(t.field.size-1)»
			«val field = t.field.get(i)»
			«IF field.useByRepository»
			statement.«getPreparedMethodName(indexSave = indexSave+1, field)»;
			«ENDIF»
			«ENDFOR»
		}
	
		@Override
		protected String updateStatement() {
			return «t.name.toFirstUpper»Constant.SQL_MERGE;
		}
	
		@Override
		protected void prepareStatetmentForUpdate(«name» t, PreparedStatement statement) throws SQLException {
			statement.setLong(1, t.getId());
			«var indexUpdate = 1»
			«FOR i : 0..(t.field.size-1)»
			«val field = t.field.get(i)»
			«IF field.useByRepository»
			statement.«getPreparedMethodName(indexUpdate = indexUpdate+1, field)»;
			«ENDIF»
			«ENDFOR»
		}
	
		@Override
		protected String deleteStatement() {
			return «t.name.toFirstUpper»Constant.SQL_DELETE_BY_ID;
		}
		
		@Override
		protected void prepapreStatementForDelete(«name» t, PreparedStatement statement) throws SQLException {
			statement.setLong(1, t.getId());
		}
	}
	'''
	
	def static splitCamelCaseString(String s) {
  		s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")
  	}
	
	def String getPreparedMethodName(int fieldIndex, Field field){
		val typeName = field.datatype.simpleName
		if((typeName).equals("LocalDateTime")){
			return '''setTimestamp(«fieldIndex», Timestamp.valueOf(t.get«field.name»()))'''
		}else if(typeName.equals("Integer")){
			return '''setInt(«fieldIndex», t.get«field.name»())'''
		}else{
			return '''set«typeName»(«fieldIndex», t.get«field.name»())'''
		}
		
	}
	
	def String getValue(Field field){
		val typeName = field.datatype.simpleName
		val fieldName = field.name.splitCamelCaseString.map[it].reduce[p1, p2|p1+'_'+p2].toUpperCase
		if((typeName).equals("LocalDateTime")){
			return '''resultSet.getTimestamp("«fieldName»").toLocalDateTime()''';
		}else if(typeName.equals('String')){
			return '''resultSet.getString("«fieldName»")''';
		}else if(typeName.equals('Double') || typeName.equals('double') ){
			return '''resultSet.getDouble("«fieldName»")''';
		}else if(typeName.equals('Long') || typeName.equals('long') ){
			return '''resultSet.getLong("«fieldName»")''';
		}else if(typeName.equals('Blob') || typeName.equals('blob') ){
			return '''resultSet.getBlob("«fieldName»")''';
		}else if(typeName.equals('Clob') || typeName.equals('clob') ){
			return '''resultSet.getClob("«fieldName»")''';
		}else if(typeName.equals('Integer') || typeName.equals('int') ){
			return '''resultSet.getInt("«fieldName»")''';
		}
	}
}