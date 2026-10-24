Function TXZ8F4XDZB%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6$
    Local local7%
    Local local8$
    Local local9%
    Local local10.T402X2Z846
    
    local0 = eax_0007
    If (YBF6BXF6X(local0) = $00) Then
        local1 = TX0Z2Z4F86D(local0, "servers")
        If (T4FDZFB8X4(local1) <> 0) Then
            local2 = TD4644B68Z(local1)
            local3 = TD0DFDZ4XX(local2)
            For local4 = $00 To (local3 - $01) Step $01
                local5 = D8XX4X0D0(local2, local4)
                If (TX4420B6F6(local5) <> 0) Then
                    local6 = TX22X8622X4(local5, "", "ip")
                    local7 = X6406FDDBD(local5, $00, "category")
                    If (((local6 <> "") And ((local7 = $02) Lor (local7 = $03))) <> 0) Then
                        local8 = trim(T26ZD804D6(local6, ":", $00))
                        local9 = (Int trim(T26ZD804D6(local6, ":", $01)))
                        local10 = YX0B0D2DF6(local8, local9, local7)
                        If (local10 <> Null) Then
                            local10\Field8 = $01
                            B24D0X6Z8(TXFD22D0402\Field3)
                        EndIf
                    EndIf
                EndIf
            Next
        EndIf
    EndIf
    Y00DFZDDF6(local0)
    Return $00
End Function
