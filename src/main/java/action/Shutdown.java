package action;

import org.btrplace.model.Node;

import java.util.ArrayList;

/**
 * Created by vkherbac on 17/02/15.
 */
public class Shutdown extends ActionLauncher {

    private Node node;
    
    public Shutdown(Node node) {

        this.node = node;
        
        String nodeName = node.toString();

        script = "shutdown.sh";

        params = new ArrayList<String>();

        params.add(nodeName);
        params.add("admin");
        params.add("mdpbmc");
        params.add("/tmp");
    }

    @Override
    public String toString() {
        return "shutdown.sh(node=" + node.toString() + ")" ;
    }
}
