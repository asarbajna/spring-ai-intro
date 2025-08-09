package guru.springframework.springaiintro.model;

import javax.validation.constraints.NotNull;

public record GetCapitalRequest(@NotNull String stateOrCountry) {
}
