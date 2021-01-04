package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

  @Test
  void testKebab() throws JsonProcessingException {
    BeerDto dto = getDto();

    String json = objectMapper.writeValueAsString(dto);
    System.out.println(dto);
  }

  @Test
  void testDeserialize() throws IOException {

    // aus dem obigen serializer sout kopiert
    String json = "{\"beerId\":\"9f5425c9-99b3-423a-93da-3d5e7d722362\",\"beer-name\":\"BeerName\",\"beer-style\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"created-date\":\"2021-01-03T14:29:22.2503867+01:00\",\"last-updated-date\":null}";

    BeerDto dto = objectMapper.readValue(json, BeerDto.class);

    System.out.println(dto);
  }
}
