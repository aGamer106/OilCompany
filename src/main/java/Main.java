public class Main {
    public static void main(String[] args) {

        OilCompany oilCompany = new OilCompany();

        FixedExtractor fixedExtractor = new FixedExtractor(95,25,"Bucuresti");
        MobileExtractor mobileExtractor = new MobileExtractor(25,5,"Ploiesti");
        OffshoreExtractor offshoreExtractor = new OffshoreExtractor(70,70);

        Worker doctor = new Worker("Damian", WorkerPosition.MEDIC, 10);
        Worker worker = new Worker("Alex", WorkerPosition.MANUAL_WORKER, 30);
        Worker worker1 = new Worker("Cosmin", WorkerPosition.MANUAL_WORKER, 30);
        Worker worker2 = new Worker("Cristi", WorkerPosition.MANUAL_WORKER, 16);
        Worker worker3 = new Worker("Serban", WorkerPosition.MANAGER, 30);

        offshoreExtractor.addWorker(doctor);
        offshoreExtractor.addWorker(worker);
        offshoreExtractor.addWorker(worker1);
        offshoreExtractor.addWorker(worker2);
        offshoreExtractor.addWorker(worker3);

        oilCompany.addExtractor(fixedExtractor);
        oilCompany.addExtractor(offshoreExtractor);
        oilCompany.addExtractor(mobileExtractor);

        System.out.println(oilCompany.getNoOfDevices());
        System.out.println(oilCompany.getExtractorsMore95());

    }
}
