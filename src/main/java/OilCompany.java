import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OilCompany{

    private List<Extractor> extractors;

    public OilCompany() {
        this.extractors = new ArrayList<>();
    }

    public void addExtractor(Extractor extractor) {
        extractors.add(extractor);
    }

    public List<Extractor> getExtractorsMore95(){
        return extractors.stream().filter(v -> (v.getQuantity()/v.getCapacity())*100 > 95).collect(Collectors.toList());
    }


    public int getNoOfDevices() {
        int counter = 0;
        for (Extractor extractor : extractors) {
            if(extractor instanceof Reporter reporter && reporter.reportFault()){
                counter++;
            }
        }
        return counter;
    }
}
