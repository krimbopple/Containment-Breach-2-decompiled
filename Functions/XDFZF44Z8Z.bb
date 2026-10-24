Function XDFZF44Z8Z%()
    Local local0%
    Local local1.T402X2Z846
    local0 = writefile(Y02FXZBDX6)
    If (local0 <> $00) Then
        writeline(local0, "{")
        writeline(local0, (((chr($22) + "servers") + chr($22)) + ":"))
        writeline(local0, "[")
        For local1 = Each T402X2Z846
            If (((local1\Field10 = $02) Lor (local1\Field10 = $03)) <> 0) Then
                writeline(local0, "{")
                writeline(local0, (((((((((chr($22) + "ip") + chr($22)) + ": ") + chr($22)) + local1\Field29) + ":") + (Str local1\Field16)) + chr($22)) + ","))
                writeline(local0, ((((chr($22) + "category") + chr($22)) + ": ") + (Str local1\Field10)))
                writeline(local0, "},")
            EndIf
        Next
        writeline(local0, "{")
        writeline(local0, "}")
        writeline(local0, "]")
        writeline(local0, "}")
        closefile(local0)
    EndIf
    Return $00
End Function
