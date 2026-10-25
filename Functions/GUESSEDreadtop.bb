Function GUESSEDreadtop%(arg0$)
    Local local0%
    Local local1$[1000]
    Local local2%
    Local local3%
    Local local4%
    Local local5$
    local0 = readfile(arg0)
    If (local0 <> $00) Then
        local2 = $00
        While (eof(local0) = $00)
            local1[local2] = readline(local0)
            local2 = (local2 + $01)
        Wend
        closefile(local0)
        For local3 = $00 To (local2 - $01) Step $01
            If (GUESSEDgetlower(local1[local3]) = "top") Then
                MP_ParseServerAddress(local1[local3])
            EndIf
        Next
        seedrnd(millisecs())
        local3 = (local2 - $01)
        While (local3 >= $00)
            local4 = rand($00, local3)
            local5 = local1[local4]
            local1[local4] = local1[local3]
            local1[local3] = local5
            local3 = (local3 + $FFFFFFFF)
        Wend
        For local3 = $00 To (local2 - $01) Step $01
            If (GUESSEDgetlower(local1[local3]) <> "top") Then
                MP_ParseServerAddress(local1[local3])
            EndIf
        Next
    EndIf
    Return $00
End Function
