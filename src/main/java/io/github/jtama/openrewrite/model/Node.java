package io.github.jtama.openrewrite.model;

/**
 * Represents a node in the project graph, corresponding to a Java class.
 */
public class Node {
    private final String id;
    private final String group;
    private int incoming;
    private int outgoing;

    /**
     * Constructs a new Node.
     *
     * @param id The fully qualified name of the class.
     * @param group The package name of the class.
     */
    public Node(String id, String group) {
        this.id = id;
        this.group = group;
        this.incoming = 0; // Start with a base size
        this.outgoing = 0; // Start with a base size
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public int getIncoming() {
        return incoming;
    }

    public int getOutgoing() {
        return outgoing;
    }

    /**
     * Increments the size of the node, typically representing an additional incoming connection.
     */
    public void incrementIncoming() {
        this.incoming++;
    }

    /**
     * Increments the size of the node, typically representing an additional incoming connection.
     */
    public void incrementOutgoing() {
        this.outgoing++;
    }
}