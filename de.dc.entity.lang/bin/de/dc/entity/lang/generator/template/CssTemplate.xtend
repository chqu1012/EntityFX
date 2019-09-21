package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class CssTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Extended«t.name»ApplicationPane.css'''
	
	override gen(Entity t)'''
	.split-pane{
		-fx-base: white;
	    -fx-background-insets: 0, 0;
	    -fx-padding: 0;
	}
	
	.split-pane > .split-pane-divider {
	    -fx-padding: 0 0.1em 0 0.1em; /* 0 3 0 3 */
	}
	/* horizontal the two nodes are placed to the left/right of each other. */
	.split-pane:horizontal > .split-pane-divider {
	   -fx-background-color: #DDDDDD;
	   -fx-background-insets: 0, 0 1 0 1;
	}
	/* vertical the two nodes are placed on top of each other. */
	.split-pane:vertical > .split-pane-divider {
	   -fx-background-color: #DDDDDD;
	   -fx-background-insets: 0, 1 0 1 0;
	}
	
	.tab-pane{
	    -fx-base: white;
	    -fx-background-insets: 0;
	    -fx-padding: 0;
	}
	'''
}