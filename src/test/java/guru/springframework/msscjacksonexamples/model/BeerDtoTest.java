package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


@JsonTest
class BeerDtoTest extends BaseTest {

  @Test
  void TestSerializeDto() throws JsonProcessingException {
    BeerDto beerDto = getDto();

    String jsonString = objectMapper.writeValueAsString(beerDto);
    System.out.println(jsonString);
  }

  @Test
  void testDeserialize() throws IOException {

    // aus dem obigen serializer sout kopiert
    String json = "{\"beerId\":\"9f5425c9-99b3-423a-93da-3d5e7d722362\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2021-01-03T14:29:22.2503867+01:00\",\"lastUpdatedDate\":null}";

    BeerDto dto = objectMapper.readValue(json, BeerDto.class);

    System.out.println(dto);
  }
}