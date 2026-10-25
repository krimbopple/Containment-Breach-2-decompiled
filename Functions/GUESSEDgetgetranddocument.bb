Function GUESSEDgetgetranddocument%(arg0.itemtemplates)
    Select right(arg0\Field19, $03)
        Case "427","500","513","714","860"
            Return $00
    End Select
    Return $01
    Return $00
End Function
