package org.processmining.plugins;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;

public class SMA {
		@Plugin(
				name = "SMA Plugin", 
                parameterLabels = {}, 
                returnLabels = { "Hello world string" }, 
                returnTypes = { String.class }, 
                userAccessible = true, 
                help = "Produces the string: 'Hello world'"
				
		)
		@UITopiaVariant(
                affiliation = "My company", 
                author = "FAY", 
                email = "Example@gmail.com"
        )
		
		public static String helloWorld(PluginContext context) {
            return "Hello World";
		}
}
