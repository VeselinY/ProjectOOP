package Storage;

public class Product {
    private String name;
    private String expiryDate;
    private String dateOfReceipt;
    private String manufacturer;
    private Units unit;
    private int quantity;
    private String comment;

    public Product(String name, String expiryDate, String dateOfReceipt, String manufacturer, Units unit, int quantity, String comment) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.dateOfReceipt = dateOfReceipt;
        this.manufacturer = manufacturer;
        this.unit = unit;
        this.quantity = quantity;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(String dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Units getUnit() {
        return unit;
    }

    public void setUnit(Units unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Product:" +
                "name='" + name + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", dateOfReceipt='" + dateOfReceipt + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", unit=" + unit +
                ", quantity=" + quantity +
                ", comment='" + comment + '\'' +
                '}';
    }
}
