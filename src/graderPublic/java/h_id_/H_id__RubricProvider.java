package h_id_;

import org.sourcegrade.jagr.api.rubric.Rubric;
import org.sourcegrade.jagr.api.rubric.RubricProvider;

public class H_id__RubricProvider implements RubricProvider {

    public static final Rubric RUBRIC = Rubric.builder()
        .title("H_id_")
        .build();

    @Override
    public Rubric getRubric() {
        return RUBRIC;
    }
}
