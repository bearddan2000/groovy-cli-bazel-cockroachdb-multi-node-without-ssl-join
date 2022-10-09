package example;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class Main {

  public static void main(String[] args) {
      final String SCHEMA_PATH = "animal.public.";
        final String connectionStr = "jdbc:postgresql://db:26257/animal?sslmode=disable";

    example.chain.ILink obj = new example.chain.Driver();

    if (obj.hasResource("org.postgresql.Driver", "root", connectionStr)){
      example.db.print.output.IOutput output = new example.db.print.output.ToConsole();
      java.util.List<String> tblNames = new java.util.ArrayList<String>();
      tblNames << SCHEMA_PATH + "dog";
      tblNames << SCHEMA_PATH + "breedLookup";
      tblNames << SCHEMA_PATH + "colorLookup";

      for ( String tbl : tblNames)
        example.db.DBQuery.query("root", connectionStr, tbl, output);
    }
  }
}
