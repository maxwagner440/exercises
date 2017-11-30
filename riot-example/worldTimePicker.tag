<world-time-picker>
    <ul>
        <li each="{cities}">
            <a onclick="{newTimeZone}" data-zone="{zone}" href="#">{ title }</a>
        </li>
    </ul>


    <script>
        this.cities = [
            {
                title: 'New York', 
                zone: 'America/New_York',
            },
            {
                title: 'Los Angelas',
                zone: 'America/Los_Angelas',
            },
            {
                title: 'Tokyo',
                zone: 'Asia/Tokyo',
            },
            ];

        this.newTimeZone = function(event){
            event.preventDefault();
            var zone = event.target.getAttribute('data-zone');
            opts.bus.trigger('new_timezone', zone);
        }
    </script>
</world-time-picker>