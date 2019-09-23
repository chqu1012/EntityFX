package de.dc.entity.lang.generator.template.metro

import de.dc.entity.lang.generator.template.IGenerator
import de.dc.entity.model.Entity

class MetroCssTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Metro�t.name�Pane.css'''
	
	override gen(Entity t)'''
	.main-content{
		-fx-background-color: white;
	}
	
	.navigation{
		-fx-background-color: #174799;
	}
	
	.list-cell {
	    -fx-background-color: transparent;
	    -fx-text-fill: white;
	    -fx-font-size: 16.0;
	}
	.list-view {
	    -fx-background-color: transparent;
	}
	
	.list-cell:filled:selected:focused, .list-cell:filled:selected {
	    -fx-background-color: #0093ff;
	    -fx-text-fill: white;
	}
	
	.list-cell:filled:hover {
	    -fx-background-color: #55B7FF;
	    -fx-text-fill: white;
	}
	
	.list-cell:filled:hover {
	    -fx-background-color: #55B7FF;
	    -fx-text-fill: white;
	}
	
	.list-view .scroll-bar:horizontal {
	    -fx-opacity: 0;
	    -fx-padding:-7;
	}
	
	.list-view .scroll-bar:vertical {
	    -fx-opacity: 0;
	    -fx-padding:-7;
	}
	
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
	
	.tab-pane {
	    -fx-tab-min-height: 36; /* 22 */
	    -fx-tab-max-height: 36; /* 22 */
	}
	.tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-label {
	    -fx-alignment: CENTER;
	    -fx-text-fill: white;
	}
	.tab-pane > .tab-header-area > .headers-region > .tab {
	    -fx-background-insets: 0 1 1 0, 1 2 1 1, 2 3 1 2;
	    -fx-background-radius: 3 3 0 0, 2 2 0 0, 1 1 0 0;
	    -fx-padding: 0.083333em 0.5em 0.0769em 0.5em; /* 1 6 0.99 6 */
	}
	.tab-pane > .tab-header-area > .headers-region > .tab:top {
	    -fx-background-color: #0F2F66;
	    -fx-text-fill: white;
	    -fx-font-weight: bold;
	}
	.tab-pane > .tab-header-area > .headers-region > .tab:right {
	    -fx-background-color: -fx-outer-border, -fx-inner-border-bottomup, -fx-body-color-bottomup;
	}
	.tab-pane > .tab-header-area > .headers-region > .tab:bottom {
	    -fx-background-color: -fx-outer-border, -fx-inner-border-bottomup, -fx-body-color-bottomup;
	}
	.tab-pane > .tab-header-area > .headers-region > .tab:left {
	    -fx-background-color: -fx-outer-border, -fx-inner-border, -fx-body-color;
	}
	.tab-pane > .tab-header-area > .headers-region > .tab:hover {
	    -fx-color: -fx-hover-base;
	}
	.tab-pane > .tab-header-area > .headers-region > .tab:selected {
	    -fx-background-color: #174799;
	    -fx-background-insets: 0 0 0 0, 1 2 0 1, 0 0 0 0;
	}
	
	.tab-pane-content{
		-fx-background-color: #174799;	
	}
	
	.tab-pane:focused > .tab-header-area > .headers-region > .tab:selected .focus-indicator {
	    -fx-border-width: 0;
	    -fx-border-color: white;
	    -fx-border-insets: 0;
	    -fx-border-radius: 2, 1; /* looks sharper if outer border has a tighter radius (2 instead of 3) */
	}
	.tab-pane:focused > .tab-header-area > .headers-region > .tab:bottom:selected .focus-indicator {
	    -fx-border-insets: 0;
	}
	.tab-pane > .tab-header-area > .headers-region > .tab:disabled:hover {
	    -fx-color: -fx-base;
	}
	.tab-pane > .tab-header-area > .tab-header-background {
	    /* TODO should not be using text-box-border I think? */
	    -fx-background-color: white;
	}
	.tab-pane:top > .tab-header-area > .tab-header-background {
	    -fx-background-insets: 0, 0 0 1 0, 1;
	}
	.tab-pane:bottom > .tab-header-area > .tab-header-background {
	    -fx-background-insets: 0, 1 0 0 0, 1;
	}
	.tab-pane:left > .tab-header-area > .tab-header-background {
	    -fx-background-insets: 0, 0 1 0 0, 1;
	}
	.tab-pane:right > .tab-header-area > .tab-header-background {
	    -fx-background-insets: 0, 0 0 0 1, 1;
	}
	.tab-pane:top > .tab-header-area {
	    /*-fx-padding: 0.416667em 0.166667em 0.0em 0.416667em; *//* 5 2 0 5 */
	    -fx-padding: 0.416667em 5 0.0em 0.416667em; /* 5 2 0 5 */
	}
	.tab-pane:bottom > .tab-header-area {
	    -fx-padding: 0 0.166667em 0.416667em 0.416667em; /* 0 2 5 5 */
	}
	.tab-pane:left > .tab-header-area {
	    -fx-padding: 0.416667em 0.0em 0.166667em 0.416667em; /* 5 0 2 5 */
	}
	.tab-pane:right > .tab-header-area {
	    -fx-padding: 0.416667em 0.416667em 0.166667em 0.0em; /* 5 5 2 0 */
	}
	/* TODO: scaling the shape seems to make it way too large */
	.tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-close-button {
	    -fx-background-color: -fx-mark-color;
	    -fx-shape: "M 0,0 H1 L 4,3 7,0 H8 V1 L 5,4 8,7 V8 H7 L 4,5 1,8 H0 V7 L 3,4 0,1 Z";
	    -fx-scale-shape: false;
	    -fx-effect: dropshadow(two-pass-box , rgba(255, 255, 255, 0.4), 1, 0.0 , 0, 1);
	}
	.tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-close-button:hover {
	    -fx-background-color: derive(-fx-mark-color, -30%);
	}
	/* CONTROL BUTTONS */
	.tab-pane > .tab-header-area > .control-buttons-tab > .container {
	    -fx-padding: 3 0 0 0;
	}
	.tab-pane > .tab-header-area > .control-buttons-tab > .container > .tab-down-button {
	    -fx-background-color: -fx-outer-border, -fx-inner-border, -fx-body-color;
	    -fx-background-insets: -1 0 5 0, 0 1 6 1, 1 2 7 2;
	    -fx-padding: 4 4 9 4;
	    -fx-background-radius: 10;
	}
	.tab-pane:bottom > .tab-header-area > .control-buttons-tab > .container > .tab-down-button {
	    -fx-padding: -5 4 4 4; /* TODO convert to ems */
	}
	/* FLOATING TABS CUSTOMISATION */
	.tab-pane.floating > .tab-header-area > .tab-header-background {
	    -fx-background-color: null;
	}
	.tab-pane.floating > .tab-header-area {
	    -fx-background-color: null;
	}
	.tab-pane.floating > .tab-content-area {
	    -fx-background-color: -fx-outer-border, -fx-background;
	    -fx-background-insets: 0, 1;
	    -fx-background-radius: 2, 0;
	    -fx-padding: 2;
	}
	'''
	
}