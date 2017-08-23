package org.msn.test.assignment.players.repository.cvs;

import org.junit.Before;
import org.junit.Test;
import org.msn.test.assignment.players.repository.csv.CsvPlayersRepository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CsvPlayersRepositoryTest {

    private static final String fileName = "/data/players.csv";

    private CsvPlayersRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = new CsvPlayersRepository(fileName);
        repository.afterPropertiesSet();
    }

    @Test
    public void testFindAll() {
        assertEquals(20, repository.findAll().size());
    }

    @Test
    public void testFindByPlayerId() {
        assertTrue(repository.findByPlayerId(8040L).isPresent());
    }

    @Test
    public void testFindByPlayerIdNotFound() {
        assertFalse(repository.findByPlayerId(0L).isPresent());
    }
}
