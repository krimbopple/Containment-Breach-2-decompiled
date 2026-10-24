Function init294drinks%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    If (i_294\Field2 <> $00) Then
        Y00DFZDDF6(i_294\Field2)
    EndIf
    i_294\Field2 = X22X8B6X80((lang\Field0 + "Data\SCP-294.jsonc"))
    If (T4FDZFB8X4(i_294\Field2) <> 0) Then
        i_294\Field0 = TD4644B68Z(i_294\Field2)
    Else
        Y00DFZDDF6(i_294\Field2)
        
        i_294\Field2 = eax_003A
        i_294\Field0 = TD4644B68Z(i_294\Field2)
    EndIf
    i_294\Field3 = TBFZ246642()
    local2 = TD0DFDZ4XX(i_294\Field0)
    For local0 = $00 To (local2 - $01) Step $01
        local3 = TD4644B68Z(TX0Z2Z4F86D(D8XX4X0D0(i_294\Field0, local0), "name"))
        local4 = TD0DFDZ4XX(local3)
        For local1 = $00 To (local4 - $01) Step $01
            YFZ8BD2F6(i_294\Field3, upper(TX240XXB6Z6(D8XX4X0D0(local3, local1))), local0)
        Next
    Next
    Return $00
End Function
