package az.edu.ada.wm2.lab6.model.dto;

public class CategoryRequestDto {
    private String name;

    public CategoryRequestDto() {
    }

    public CategoryRequestDto(String name) {
        this.name = name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public CategoryRequestDto build() {
            return new CategoryRequestDto(name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
