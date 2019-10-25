package ru.MaximBorisov.Lesson23;


public class StartUI {
    public void init(Input input, ProductBasket productBasket, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, productBasket);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        ProductBasket productBasket = new ProductBasket();
        UserAction[] actions = {
                new CreateIAction(),
                new UpdateAction(),
                new GetQuantityAction(),
                new DeleteAction(),
                new ShowAction(),
                new ClearAction(),
                new ExitAction()
        };
        new StartUI().init(input, productBasket, actions);
    }
}
