Function T2862DZXZB%()
    Local local0#
    Local local1#
    Local local2.T20B224BX6D
    Local local3%
    Local local4.X22ZD22448
    If (X4BX024DX0() = $00) Then
        Return $00
    EndIf
    If ((((((XZB6BXFF02\Field5 Lor menuopen) Lor consoleopen) Lor TX6X48DXXDX) = $00) And keyhit(key\Field10)) <> 0) Then
        shoulddeletegadgets = $01
        XZB6BXFF02\Field5 = (XZB6BXFF02\Field5 = $00)
        If (XZB6BXFF02\Field5 <> 0) Then
            selectedinputbox = $3ED
        Else
            XZB6BXFF02\Field14 = 0.0
        EndIf
        flushkeys()
        resetinput(5.0)
    EndIf
    If (XZB6BXFF02\Field5 <> 0) Then
        If (keyhit($01) <> 0) Then
            TXBF2X86FFX()
            Return $00
        EndIf
        local0 = (Float XZB6BXFF02\Field11)
        local1 = (Float XZB6BXFF02\Field9)
        XZB6BXFF02\Field16 = updatemenuinputbox((Int local0), (Int local1), (Int (opt\Field66 * menuscale)), (Int (30.0 * menuscale)), XZB6BXFF02\Field16, $00, $3ED, $90, 0.05, $00, $01, $00)
        If (keyhit($1C) <> 0) Then
            If (len(XZB6BXFF02\Field16) > $00) Then
                If (TXB2BFFFFFX() <> 0) Then
                    XB4DX4B6ZX(((opt\Field75 + ": ") + XZB6BXFF02\Field16), $00)
                EndIf
                YX08X06806(XZB6BXFF02\Field16)
                EX02XB462(XZB6BXFF02\Field16)
                XZB6BXFF02\Field16 = ""
            EndIf
            TXBF2X86FFX()
        EndIf
        If (keyhit($C8) <> 0) Then
            If (XZB6BXFF02\Field8 = Null) Then
                XZB6BXFF02\Field8 = (Last T20B224BX6D)
            Else
                local2 = (Before XZB6BXFF02\Field8)
                If (local2 <> Null) Then
                    XZB6BXFF02\Field8 = local2
                EndIf
            EndIf
            If (XZB6BXFF02\Field8 <> Null) Then
                XZB6BXFF02\Field16 = XZB6BXFF02\Field8\Field0
            EndIf
        EndIf
        If (keyhit($D0) <> 0) Then
            If (XZB6BXFF02\Field8 <> Null) Then
                local2 = (After XZB6BXFF02\Field8)
                If (local2 <> Null) Then
                    XZB6BXFF02\Field8 = local2
                EndIf
            EndIf
            If (XZB6BXFF02\Field8 <> Null) Then
                XZB6BXFF02\Field16 = XZB6BXFF02\Field8\Field0
            EndIf
        EndIf
        TX6X48DXXDX = $01
        menuopen = $00
        consoleopen = $00
    EndIf
    XZB6BXFF02\Field7 = $00
    local3 = $00
    For local4 = Each X22ZD22448
        local3 = (local3 + $01)
        If (local3 > $12C) Then
            Delete (First X22ZD22448)
        EndIf
        If (XZB6BXFF02\Field5 = $00) Then
            local4\Field1 = (local4\Field1 - fps\Field3[$00])
        Else
            local4\Field1 = max(local4\Field1, 0.1)
        EndIf
        If (0.0 < local4\Field1) Then
            XZB6BXFF02\Field7 = (XZB6BXFF02\Field7 + $01)
        EndIf
    Next
    Return $00
End Function
