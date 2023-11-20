package br.com.thr3team.domain.models.enums;

public enum ProductStatus {
    REGISTERED("cadastrado"),
    EXPIRED("expirado");

    private String description;

    private ProductStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
