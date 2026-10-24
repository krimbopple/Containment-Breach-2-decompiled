Function findeventvariable%(arg0.events)
    Select arg0\Field32
        Case $0E
            scribe_event = arg0
        Case $10
            skull_event = arg0
        Case $3A
            forest_event = arg0
        Case $4B
            pd_event = arg0
    End Select
    Return $00
End Function
