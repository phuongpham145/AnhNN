public class NoTaxProduct extends Product {
    @Override
    public Double getImportTax() {
        return (double) 0;
    }
}
