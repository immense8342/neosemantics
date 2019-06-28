package semantics;

import java.util.Objects;

/**
 * @see ContextResource represents a Resource with an optional graph (context) uri
 * It is used as Key for the Maps containing labels and properties
 *
 * Created on 06.06.2019
 *
 * @author Emre Arkan
 */
public class ContextResource {

  final private String uri;
  final private String graphUri;

  public ContextResource(String uri, String graphUri) {
    this.uri = uri;
    this.graphUri = graphUri;
  }

  /**
   * returns the uri of the current instance
   *
   * @return uri
   */
  public String getUri() {
    return uri;
  }

  /**
   * returns the graphUri of the current instance
   * @return graphUri
   */
  public String getGraphUri() {
    return graphUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextResource that = (ContextResource) o;
    return Objects.equals(getUri(), that.getUri()) &&
        Objects.equals(getGraphUri(), that.getGraphUri());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUri(), getGraphUri());
  }

}