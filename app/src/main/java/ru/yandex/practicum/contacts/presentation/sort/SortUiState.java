package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public void setApplyEnable(final boolean applyEnable) {
        isApplyEnable = applyEnable;
    }

    public boolean getApplyEnable() {
        return isApplyEnable;
    }

    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }

    public void setNewSelectedSortType(final String newSelectedSortType) {
        this.newSelectedSortType = newSelectedSortType;
    }

    // реализуйте get и set методы для обоих полей
}
