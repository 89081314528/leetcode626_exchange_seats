package ru.julia.leetcode626_exchange_seats.servise;

import org.springframework.stereotype.Service;
import ru.julia.leetcode626_exchange_seats.dto.ExchangeSeat;
import ru.julia.leetcode626_exchange_seats.entity.Seat;
import ru.julia.leetcode626_exchange_seats.repositories.SeatRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class SeatServiceImpl implements SeatService {
    SeatRepository seatRepository;

    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<ExchangeSeat> exchangeSeats() {
        List<Seat> seats = seatRepository.findAll();
        List<ExchangeSeat> exchangeSeats = new ArrayList<>();
        int size = seats.size();
        if (seats.size() % 2 == 0) {
        } else {
            size = seats.size() - 1;
        }
        for (int i = 0; i < size; i = i + 2) {
            Seat seat = seats.get(i);
            Seat nextSeat = seats.get(i + 1);
            exchangeSeats.add(new ExchangeSeat(seat.getId(), nextSeat.getStudent()));
            exchangeSeats.add(new ExchangeSeat(nextSeat.getId(), seat.getStudent()));
        }
        if (seats.size() % 2 != 0) {
            exchangeSeats.add(new ExchangeSeat(seats.get(size).getId(), seats.get(size).getStudent()));
        }
        return exchangeSeats;
    }
}
