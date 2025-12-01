package io.github.jtama.openrewrite.model;

import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;
import org.openrewrite.DataTable;
import org.openrewrite.Recipe;

public class LinksReport extends DataTable<@NotNull Link> {

    public LinksReport(@Nullable Recipe recipe) {
        super(recipe, "Project inner dependencies links report", "Records links between classes");
    }
}
