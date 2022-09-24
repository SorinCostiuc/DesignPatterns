package structuralDesigns.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChargerAdapter extends UsaSocket{
    private RomanianCharger romanianCharger;

    @Override
    public void chargeUsaPhone(){
        romanianCharger.chargeRomanianPhone();
    }
}
