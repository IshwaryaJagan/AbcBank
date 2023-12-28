package com.abcbank.serviceImplementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.abcbank.model.Lostorstolen_request;
import com.abcbank.model.Service_request;
import com.abcbank.repository.Lostorstolen_requestRepo;
import com.abcbank.repository.Service_requestRepo;

@Service
public class Service_requestImpl implements Service_requestRepo{
	
	
}
