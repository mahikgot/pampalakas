# Spec the RoxieLab workload

- STATUS: CLOSED
- PRIORITY: 100
- TAGS: roxielab

## Description
This is a keyed lookup against a large indexed dataset plus an external enrichment call

target record count: should be like 100GB - 1TB, lets try 1 million records
target qps: idk bro, maybe 1000qps???

## Questions
What would actually make a request fail?
given input is authed/valid, only timeouts and failures of external call

## Notes
this is not really clear to me but im closing this and using as reference
as our initial goals
