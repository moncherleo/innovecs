# innovecs QAA task

Please write class which implement interface IsDictionary. The main purpose of class to store words and count how many times disctinct word was added. Please write tests using testng\junit to test that class works great(any amount of scenarios which you think is sufficient). Please use Java 8 and maven for project.

public interface Dictionary {

    void store(String word);
    int getOccurence(String word);
}