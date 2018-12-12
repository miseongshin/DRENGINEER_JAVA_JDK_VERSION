package jdk9.com.logicbig;

import jdk9.common.widget.SimpleRenderer;

public class RandererSupport {
	public void render(Object object) {
		new SimpleRenderer().renderAsString(object);
	}
}
