package io.github.jtama.openrewrite.model;

import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;
import org.openrewrite.DataTable;
import org.openrewrite.Recipe;

public class NodesReport extends DataTable<@NotNull Node> {

    public NodesReport(@Nullable Recipe recipe) {
        super(recipe, "Project inner dependencies nodes report", "Records classes and counts there internal dependencies");
    }
}
