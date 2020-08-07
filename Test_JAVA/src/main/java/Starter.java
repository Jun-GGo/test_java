import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Starter {
    public static void main(String[] args){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase db = mongoClient.getDatabase("EQBR_core");
        MongoCollection<Document> documentMongoCollection = db.getCollection("known_hosts");
        print(documentMongoCollection.countDocuments());




    }

    private static void print(Object o){
        System.out.println(o);
    }
}
