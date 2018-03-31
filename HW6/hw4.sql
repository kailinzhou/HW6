Create or replace trigger countries_trigger
before insert on countries
for each row
begin
:new.CountryID :=countries_auto_incr.nextval;
End;
SELECT @@SERVERNAME