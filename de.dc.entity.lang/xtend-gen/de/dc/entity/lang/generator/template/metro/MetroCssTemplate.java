package de.dc.entity.lang.generator.template.metro;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MetroCssTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Metro");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Pane.css");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".main-content{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-fx-background-color: white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".navigation{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-fx-background-color: #174799;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".list-cell {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: transparent;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-text-fill: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-font-size: 16.0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".list-view {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: transparent;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".list-cell:filled:selected:focused, .list-cell:filled:selected {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #0093ff;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-text-fill: white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".list-cell:filled:hover {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #55B7FF;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-text-fill: white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".list-cell:filled:hover {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #55B7FF;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-text-fill: white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".list-view .scroll-bar:horizontal {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-opacity: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding:-7;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".list-view .scroll-bar:vertical {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-opacity: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding:-7;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".split-pane{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-fx-base: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".split-pane > .split-pane-divider {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0 0.1em 0 0.1em; /* 0 3 0 3 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("/* horizontal the two nodes are placed to the left/right of each other. */");
    _builder.newLine();
    _builder.append(".split-pane:horizontal > .split-pane-divider {");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("-fx-background-color: #DDDDDD;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("-fx-background-insets: 0, 0 1 0 1;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("/* vertical the two nodes are placed on top of each other. */");
    _builder.newLine();
    _builder.append(".split-pane:vertical > .split-pane-divider {");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("-fx-background-color: #DDDDDD;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("-fx-background-insets: 0, 1 0 1 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".tab-pane {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-tab-min-height: 36; /* 22 */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-tab-max-height: 36; /* 22 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-label {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-alignment: CENTER;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-text-fill: white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0 1 1 0, 1 2 1 1, 2 3 1 2;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-radius: 3 3 0 0, 2 2 0 0, 1 1 0 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.083333em 0.5em 0.0769em 0.5em; /* 1 6 0.99 6 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab:top {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #0F2F66;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-text-fill: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-font-weight: bold;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab:right {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-outer-border, -fx-inner-border-bottomup, -fx-body-color-bottomup;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab:bottom {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-outer-border, -fx-inner-border-bottomup, -fx-body-color-bottomup;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab:left {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-outer-border, -fx-inner-border, -fx-body-color;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab:hover {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-color: -fx-hover-base;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab:selected {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #174799;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0 0 0 0, 1 2 0 1, 0 0 0 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".tab-pane-content{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-fx-background-color: #174799;\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".tab-pane:focused > .tab-header-area > .headers-region > .tab:selected .focus-indicator {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-width: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-color: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-insets: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-radius: 2, 1; /* looks sharper if outer border has a tighter radius (2 instead of 3) */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:focused > .tab-header-area > .headers-region > .tab:bottom:selected .focus-indicator {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-insets: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab:disabled:hover {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-color: -fx-base;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .tab-header-background {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/* TODO should not be using text-box-border I think? */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:top > .tab-header-area > .tab-header-background {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 0 0 1 0, 1;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:bottom > .tab-header-area > .tab-header-background {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 1 0 0 0, 1;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:left > .tab-header-area > .tab-header-background {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 0 1 0 0, 1;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:right > .tab-header-area > .tab-header-background {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 0 0 0 1, 1;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:top > .tab-header-area {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/*-fx-padding: 0.416667em 0.166667em 0.0em 0.416667em; *//* 5 2 0 5 */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.416667em 5 0.0em 0.416667em; /* 5 2 0 5 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:bottom > .tab-header-area {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0 0.166667em 0.416667em 0.416667em; /* 0 2 5 5 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:left > .tab-header-area {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.416667em 0.0em 0.166667em 0.416667em; /* 5 0 2 5 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:right > .tab-header-area {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.416667em 0.416667em 0.166667em 0.0em; /* 5 5 2 0 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("/* TODO: scaling the shape seems to make it way too large */");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-close-button {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-mark-color;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-shape: \"M 0,0 H1 L 4,3 7,0 H8 V1 L 5,4 8,7 V8 H7 L 4,5 1,8 H0 V7 L 3,4 0,1 Z\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-scale-shape: false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-effect: dropshadow(two-pass-box , rgba(255, 255, 255, 0.4), 1, 0.0 , 0, 1);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-close-button:hover {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: derive(-fx-mark-color, -30%);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("/* CONTROL BUTTONS */");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .control-buttons-tab > .container {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 3 0 0 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane > .tab-header-area > .control-buttons-tab > .container > .tab-down-button {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-outer-border, -fx-inner-border, -fx-body-color;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: -1 0 5 0, 0 1 6 1, 1 2 7 2;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 4 4 9 4;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-radius: 10;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane:bottom > .tab-header-area > .control-buttons-tab > .container > .tab-down-button {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: -5 4 4 4; /* TODO convert to ems */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("/* FLOATING TABS CUSTOMISATION */");
    _builder.newLine();
    _builder.append(".tab-pane.floating > .tab-header-area > .tab-header-background {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane.floating > .tab-header-area {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".tab-pane.floating > .tab-content-area {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-outer-border, -fx-background;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 1;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-radius: 2, 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 2;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}