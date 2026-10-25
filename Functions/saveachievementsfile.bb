Function saveachievementsfile%()
    Local local0$
    local0 = (Str writefile((T8B628B2BZ + "\Euclid Labs\SCPCB2\Data\Does the Black Moon howl.cb")))
    writebyte((Int local0), _S2IMapContains(unlockedachievements, "keter"))
    writebyte((Int local0), _S2IMapContains(unlockedachievements, "apollyon"))
    writebyte((Int local0), snavunlocked)
    writebyte((Int local0), ereaderunlocked)
    closefile((Int local0))
    Return $00
End Function
