package edu.nadia.cursova.dataSet;

import edu.nadia.cursova.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataSet {
    private List<AccountingForBuyers> accountingForBuyers = new ArrayList<>(Arrays.asList(
            new AccountingForBuyers("1", "Pavliuk", "+380975313780",  "15.01.2001",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new AccountingForBuyers("2", "Pavliuk", "+380975313780",  "15.01.2001",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<AccountingForGoodsSold> accountingForGoodsSold = new ArrayList<>(Arrays.asList(
            new AccountingForGoodsSold("1", "2", "3", "4", "5",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new AccountingForGoodsSold("2", "2", "3", "4", "5",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<DepartmentStore> departmentStore = new ArrayList<>(Arrays.asList(
            new DepartmentStore("1", "Name", "15", "1", "2", "2", "Address", "1", "200", "150",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new DepartmentStore("2", "Name", "15", "1", "2", "2", "Address", "1", "200", "150",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));

    private List<DirectoryOfGoodsNomenclature> directoryOfGoodsNomenclature = new ArrayList<>(Arrays.asList(
            new DirectoryOfGoodsNomenclature("1", "Good", LocalDateTime.now(),
                    LocalDateTime.now(), "description"),
            new DirectoryOfGoodsNomenclature("2", "Red", LocalDateTime.now(),
                    LocalDateTime.now(), "description")
    ));
    private List<Distribution> distribution = new ArrayList<>(Arrays.asList(
            new Distribution("1", "2", "3", "4", "5",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Distribution("2", "2", "3", "4", "5",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<Hall> hall = new ArrayList<>(Arrays.asList(
            new Hall("1", "name", "10", "1",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Hall("2", "name", "10", "1",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<Kiosk> kiosk = new ArrayList<>(Arrays.asList(
            new Kiosk("1", "name", "3", "2", "address", "100", "12000", "3000",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Kiosk("2", "name", "3", "2", "address", "100", "12000", "3000",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));

    private List<Manager> manager = new ArrayList<>(Arrays.asList(
            new Manager("1", "name", "14.11.2000", "14.11.2009", "380975313780", "address",
                    "5000", "1", LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Manager("2", "name", "14.11.2000", "14.11.2009", "380975313780", "address",
                    "5000", "1", LocalDateTime.now(), LocalDateTime.now(), "description")

    ));

    private List<Order> order = new ArrayList<>(Arrays.asList(
            new Order("1", "2", "3", "4", "5", "235",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Order("2", "2", "3", "4", "5", "235",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));

    private List<OrderToTheSupplier> orderToTheSupplier = new ArrayList<>(Arrays.asList(
            new OrderToTheSupplier("1", "name", "100", "1",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new OrderToTheSupplier("2", "name", "100", "1",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<OrganizationOfTrade> organizationOfTrade = new ArrayList<>(Arrays.asList(
            new OrganizationOfTrade("1", "name", "380975313780", "address", "4",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new OrganizationOfTrade("2", "name", "380975313780", "address", "4",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<Outlet> outlet = new ArrayList<>(Arrays.asList(
            new Outlet("1", "1", "1", "2", "5",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Outlet("2", "1", "1", "2", "5",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<ProductsFromSuppliers> productsFromSuppliers = new ArrayList<>(Arrays.asList(
            new ProductsFromSuppliers("1", "2", "10000", "10", "1",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new ProductsFromSuppliers("2", "2", "9000", "5", "1",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));

    private List<ProductsInOutlets> productsInOutlets = new ArrayList<>(Arrays.asList(
            new ProductsInOutlets("1", "2", "125", "10", "2",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new ProductsInOutlets("2", "2", "125", "10", "2",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<Section> section = new ArrayList<>(Arrays.asList(
            new Section("1", "10", "1", "3", "5",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Section("2", "10", "1", "3", "5",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<Seller> seller = new ArrayList<>(Arrays.asList(
            new Seller("1", "name", "11.12.2000", "12.07.2019", "38097531256", "address", "20000", "1",
                    LocalDateTime.now(), LocalDateTime.now(),"description"),
            new Seller("2", "name", "11.12.2000", "12.07.2019", "38097531256", "address", "20000", "1",
                    LocalDateTime.now(), LocalDateTime.now(),"description")
    ));
    private List<Store> store = new ArrayList<>(Arrays.asList(
            new Store("1", "name", "15", "10", "2", "address", "50", "15", "100",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Store("2", "name", "15", "10", "2", "address", "50", "15", "100",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<Supplier> supplier = new ArrayList<>(Arrays.asList(
            new Supplier("1", "name", "11.11.1978", "+380894578220", "address",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new Supplier("2", "name", "11.11.1978", "+380894578220", "address",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));
    private List<TheHeadOfTheSection> theHeadOfTheSection = new ArrayList<>(Arrays.asList(
            new TheHeadOfTheSection("1", "name", "11.01.2001", "12.02.2020", "+380976234892", "address", "10000", "2",
                    LocalDateTime.now(), LocalDateTime.now(), "description"),
            new TheHeadOfTheSection("2", "name", "11.01.2001", "12.02.2020", "+380976234892", "address", "10000", "2",
                    LocalDateTime.now(), LocalDateTime.now(), "description")
    ));

    public List<Store> getStore() {
        return store;
    }

    public void setStore(List<Store> store) {
        this.store = store;
    }

    public List<Supplier> getSupplier() {
        return supplier;
    }

    public void setSupplier(List<Supplier> supplier) {
        this.supplier = supplier;
    }

    public List<TheHeadOfTheSection> getTheHeadOfTheSection() {
        return theHeadOfTheSection;
    }

    public void setTheHeadOfTheSection(List<TheHeadOfTheSection> theHeadOfTheSection) {
        this.theHeadOfTheSection = theHeadOfTheSection;
    }

    public List<ProductsInOutlets> getProductsInOutlets() {
        return productsInOutlets;
    }

    public void setProductsInOutlets(List<ProductsInOutlets> productsInOutlets) {
        this.productsInOutlets = productsInOutlets;
    }

    public List<Section> getSection() {
        return section;
    }

    public void setSection(List<Section> section) {
        this.section = section;
    }

    public List<Seller> getSeller() {
        return seller;
    }

    public void setSeller(List<Seller> seller) {
        this.seller = seller;
    }

    public List<OrderToTheSupplier> getOrderToTheSupplier() {
        return orderToTheSupplier;
    }

    public void setOrderToTheSupplier(List<OrderToTheSupplier> orderToTheSupplier) {
        this.orderToTheSupplier = orderToTheSupplier;
    }

    public List<OrganizationOfTrade> getOrganizationOfTrade() {
        return organizationOfTrade;
    }

    public void setOrganizationOfTrade(List<OrganizationOfTrade> organizationOfTrade) {
        this.organizationOfTrade = organizationOfTrade;
    }

    public List<Outlet> getOutlet() {
        return outlet;
    }

    public void setOutlet(List<Outlet> outlet) {
        this.outlet = outlet;
    }

    public List<ProductsFromSuppliers> getProductsFromSuppliers() {
        return productsFromSuppliers;
    }

    public void setProductsFromSuppliers(List<ProductsFromSuppliers> productsFromSuppliers) {
        this.productsFromSuppliers = productsFromSuppliers;
    }

    public List<Hall> getHall() {
        return hall;
    }

    public void setHall(List<Hall> hall) {
        this.hall = hall;
    }

    public List<Kiosk> getKiosk() {
        return kiosk;
    }

    public void setKiosk(List<Kiosk> kiosk) {
        this.kiosk = kiosk;
    }

    public List<Manager> getManager() {
        return manager;
    }

    public void setManager(List<Manager> manager) {
        this.manager = manager;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public List<Distribution> getDistribution() {
        return distribution;
    }

    public void setDistribution(List<Distribution> distribution) {
        this.distribution = distribution;
    }

    public List<DirectoryOfGoodsNomenclature> getDirectoryOfGoodsNomenclature() {
        return directoryOfGoodsNomenclature;
    }

    public void setDirectoryOfGoodsNomenclature(List<DirectoryOfGoodsNomenclature> directoryOfGoodsNomenclature) {
        this.directoryOfGoodsNomenclature = directoryOfGoodsNomenclature;
    }

    public List<DepartmentStore> getDepartmentStore() {
        return departmentStore;
    }

    public void setDepartmentStore(List<DepartmentStore> departmentStore) {
        this.departmentStore = departmentStore;
    }

    public List<AccountingForGoodsSold> getAccountingForGoodsSold() {
        return accountingForGoodsSold;
    }

    public void setAccountingForGoodsSold(List<AccountingForGoodsSold> accountingForGoodsSold) {
        this.accountingForGoodsSold = accountingForGoodsSold;
    }

    public List<AccountingForBuyers> getAccountingForBuyers() {
        return accountingForBuyers;
    }

    public void setAccountingForBuyers(List<AccountingForBuyers> accountingForBuyers) {
        this.accountingForBuyers = accountingForBuyers;
    }
}
