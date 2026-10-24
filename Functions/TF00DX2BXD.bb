Function TF00DX2BXD%(arg0$)
    Local local0.TXB0X08F8BX
    Local local1%
    Local local2$
    Local local3$
    Local local4$
    Local local5$
    Local local6$
    Local local7$
    If (instr(arg0, "http", $01) <> 0) Then
        local0 = X44X4F8B46(arg0, "", FuncPtr(CF6XZ6B6F), $00)
        Return (local0 <> Null)
    Else
        local1 = readfile(arg0)
        If (local1 <> $00) Then
            While (eof(local1) = $00)
                local2 = readline(local1)
                local3 = left(local2, $06)
                If (local3 = "TAGKEY") Then
                    local4 = AB4XB0B20(local2, $00)
                    local5 = AB4XB0B20(local2, $01)
                    local6 = AB4XB0B20(local2, $02)
                    local7 = AB4XB0B20(local2, $03)
                    T60BB22DB0(local4, local5, TXX6XZ6D48((Int T26ZD804D6(local6, " ", $00)), (Int T26ZD804D6(local6, " ", $01)), (Int T26ZD804D6(local6, " ", $02))), TXX6XZ6D48((Int T26ZD804D6(local7, " ", $00)), (Int T26ZD804D6(local7, " ", $01)), (Int T26ZD804D6(local7, " ", $02))))
                EndIf
            Wend
            closefile(local1)
            Return $01
        EndIf
    EndIf
    Return $00
    Return $00
End Function
