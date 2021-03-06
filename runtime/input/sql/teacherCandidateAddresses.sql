SELECT	 
  SPRIDEN.SPRIDEN_PIDM,
  SPRADDR.SPRADDR_STREET_LINE1,
  SPRADDR.SPRADDR_CITY,
  SPRADDR.SPRADDR_STAT_CODE,
  SPRADDR.SPRADDR_ZIP,
  SPRADDR.SPRADDR_FROM_DATE,
  SPRADDR.SPRADDR_TO_DATE,
  CASE SPRADDR.SPRADDR_ATYP_CODE		 
    WHEN 'MA'	 
    THEN 'Mailing'	 
    WHEN 'PR'	 
    THEN 'Permanent'	 
    ELSE 'Other'	 
  END AS SPRADDR_ATYP_CODE,
  'City-Small' AS locale_descriptor	
FROM		
  SPRIDEN,
  SPRADDR		
WHERE
  SPRIDEN.SPRIDEN_PIDM in (99660, 90039)		 
  AND SPRADDR.SPRADDR_TO_DATE is NULL		 
  AND SPRIDEN.SPRIDEN_PIDM = SPRADDR.SPRADDR_PIDM		
