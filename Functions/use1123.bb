Function use1123%()
    Local local0.events
    Local local1%
    If ((((i_714\Field0 <> $02) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 = $00)) <> 0) Then
        XZ0260X8X2\Field78 = 3.0
        playsound_strict(loadtempsound("SFX\SCP\1123\Touch.ogg"), $00, $00)
        local1 = $01
        For local0 = Each events
            If (local0\Field32 = $10) Then
                If (playerroom = local0\Field19) Then
                    If (1.0 > local0\Field4) Then
                        local0\Field4 = 1.0
                        local1 = $00
                        Exit
                    EndIf
                EndIf
            EndIf
        Next
    Else
        createmsg(getlocalstring("msg", "skull.nothappend"), 6.0)
    EndIf
    If (local1 <> 0) Then
        msg\Field8 = format(getlocalstring("death", "1123"), subjectname, "%s")
        kill($00, $01, $00, $01)
    EndIf
    Return $00
End Function
