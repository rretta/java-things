 @GetMapping("/bin")
    public ResponseEntity<String> readJsonFromBin() {
        String binId = "bin acá";
        String apiKey = "key acá";
        String url = "https://api.jsonbin.io/v3/b/" + binId;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("secret-key", apiKey);

        RequestEntity<?> requestEntity = RequestEntity.get(URI.create(url))
                .headers(headers)
                .build();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);

        return responseEntity;
    }
