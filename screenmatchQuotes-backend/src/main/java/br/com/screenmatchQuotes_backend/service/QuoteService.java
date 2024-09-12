package br.com.screenmatchQuotes_backend.service;

import br.com.screenmatchQuotes_backend.dto.QuoteDTO;
import br.com.screenmatchQuotes_backend.model.Quote;
import br.com.screenmatchQuotes_backend.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository repository;

    public QuoteDTO getRandomQuote() {
        Quote quote = repository.getRandomQuote();
        return new QuoteDTO(quote.getTitle(), quote.getQuote(), quote.getCharacter(), quote.getPoster());
    }
}
