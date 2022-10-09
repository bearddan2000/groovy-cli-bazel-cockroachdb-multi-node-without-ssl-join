package example.chain;

public interface ILink {

  // NEW
  boolean hasResource(final String driverStr, final String usernam, final String connectionStr);
}
