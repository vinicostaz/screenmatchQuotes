package br.com.screenmatchQuotes_backend.repository;

import br.com.screenmatchQuotes_backend.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

    @Query("SELECT q FROM Quote q ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Quote getRandomQuote();
}
