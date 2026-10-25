Function loadachievementsfile%()
    Local local0$
    If (filetype((T8B628B2BZ + "\Euclid Labs\SCPCB2\Data\Does the Black Moon howl.cb")) <> $01) Then
        Return $00
    EndIf
    local0 = (Str openfile((T8B628B2BZ + "\Euclid Labs\SCPCB2\Data\Does the Black Moon howl.cb")))
    If (readbyte((Int local0)) <> 0) Then
        _S2IMapSet(unlockedachievements, "keter", $1)
    EndIf
    If (readbyte((Int local0)) <> 0) Then
        _S2IMapSet(unlockedachievements, "apollyon", $1)
    EndIf
    If (readbyte((Int local0)) <> 0) Then
        snavunlocked = $01
    EndIf
    If (readbyte((Int local0)) <> 0) Then
        ereaderunlocked = $01
    EndIf
    closefile((Int local0))
    Return $00
End Function
