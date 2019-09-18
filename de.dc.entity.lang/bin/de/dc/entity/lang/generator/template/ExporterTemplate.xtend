package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExporterTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»Exporter'''
	
	override gen(Entity t)'''
	package «t.packagePath».util;
	
	import java.io.File;
	import java.io.IOException;
	import java.nio.charset.StandardCharsets;
	
	import org.apache.commons.io.FileUtils;
	
	import javafx.scene.control.TableView;
	
	public class «t.name»gExporter {
		
		public enum Type{
			HTML,
			EXCEL,
			TEXT
			;
		}
		
		public void export(Type type, TableView<?> table, File file) throws IOException {
			switch (type) {
			case EXCEL:
				exportToExcel(table, file);
				break;
			case HTML:
				exportToHtml(table, file);
				break;
			case TEXT:
				exportToText(table, file);
				break;
			default:
				break;
			}
		}
		
		private void exportToText(TableView<?> table, File file) {
			// TODO Auto-generated method stub
			
		}
	
		private void exportToExcel(TableView<?> table, File file) {
			// TODO Auto-generated method stub
			
		}
	
		public void exportToHtml(TableView<?> table, File file) throws IOException {
			StringBuilder sb = new StringBuilder("<!DOCTYPE html>").append(
					"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:th=\"http://www.thymeleaf.org\"><head><meta charset=\"utf-8\" />")
					.append("<title>DataTables View</title>")
					.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">")
					.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>")
					.append("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>")
					.append("<link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css\">")
					.append("<script src=\"https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js\"></script>")
					.append("<script>$(document).ready(function() {$('table.display').DataTable();});</script>")
					.append("</head>");
			sb.append("<body>").append("\n").append("<table class=\"display\" style=\"width:100%\">");
			sb.append("<thead><tr>");
			for (int j = 0; j < table.getVisibleLeafColumns().size(); j++) {
				sb.append("<th>" + table.getVisibleLeafColumns().get(j).getText() + "</th>");
			}
			sb.append("</tr></thead>\n");
			sb.append("<tbody>\n");
			for (int i = 0; i < table.getItems().size(); i++) {
				sb.append("<tr>");
				for (int j = 0; j < table.getVisibleLeafColumns().size(); j++) {
					if (table.getVisibleLeafColumns().get(j).getCellData(i) != null) {
						sb.append("<td>" + table.getVisibleLeafColumns().get(j).getCellData(i).toString() + "</td>");
					} else {
						sb.append("<td></td>");
					}
				}
				sb.append("</tr>");
			}
			sb.append("</tbody></table></body>");
			FileUtils.write(file, sb.toString(), StandardCharsets.UTF_8);
		}
	}
	'''
	
}