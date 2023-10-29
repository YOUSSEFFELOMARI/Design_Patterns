package CreationalPatterns.Factory;

public class MasterCard implements IPaymentCard {

        @Override
        public String getName() {
            return "Master Card";
        }

        @Override
        public String getProvider() {
            return "Master";
        }

}

