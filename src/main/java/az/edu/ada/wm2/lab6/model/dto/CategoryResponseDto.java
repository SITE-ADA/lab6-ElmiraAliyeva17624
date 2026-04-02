package az.edu.ada.wm2.lab6.model.dto;

import java.util.UUID;

public class CategoryResponseDto {
    private UUID id;
    private String name;

    public CategoryResponseDto() {
    }

    public CategoryResponseDto(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private UUID id;
        private String name;

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public CategoryResponseDto build() {
            return new CategoryResponseDto(id, name);
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
