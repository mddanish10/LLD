package behaviouralPattern.memento;

public class EditorClient {
    static void main() {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.write("Hello Danish");
        caretaker.saveState(textEditor);

        textEditor.write("Hello Virat");
        caretaker.saveState(textEditor);
        caretaker.undo(textEditor);

        System.out.println(textEditor.getContent());
    }



}
