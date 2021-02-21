package DailyTheory.Nested;

public class AnonymousSample {
    class MagicButtonListener implements EventListener{
        @Override
        public void onClick() {
            System.out.println("Magic inner Button Clicked!");
        }
    }

    public static void main(String args[]){
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListener();
        sample.setButtonListenerAnonymous();
    }

    public void setButtonListenerAnonymous(){
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Anonymous button clicked!");
            }
        });
        button.onClickProcess();
    }

    public void setButtonListener(){
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

}
