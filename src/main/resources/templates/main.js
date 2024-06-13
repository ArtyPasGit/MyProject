function updateContent() {
        var priority = document.getElementById("priority").value;
        var contentDiv = document.getElementById("numberOfComplaintsDisplay");

        if (priority === "P1") {
            contentDiv.style.display = "contents";
        } else {
            contentDiv.style.display = "none";
        }
    }

function updateNetworkType() {
var networkType = document.getElementById("networkType").value;
var affectedCellsDiv = document.getElementById("affectedCellsDisplay");

if (networkType === "Mobile") {
    affectedCellsDiv.style.display = "flex";
} else {
    affectedCellsDiv.style.display = "none";
}

if (networkType === "TV") {
           let tvDialog = document.getElementById('tvDialog');

tvDialog.classList.add('active');


    fetchChannels(); // Fetch channels from the server
} else {
    document.getElementById('tvDialog').style.display = 'none';
}
}

async function showChannelPopup() {
const response = await fetch('/incident/channels');
const channels = await response.json();

const channelSelect = document.getElementById('channelSelect');
channelSelect.innerHTML = ''; // Clear previous options

channels.forEach(channel => {
    const option = document.createElement('option');
    option.text = channel.channelName;
    option.value = channel.channelName;
    channelSelect.appendChild(option);
});

}
const listOfSelectedChannels = []

    function hideChannelsPopup() {
        document.getElementById('channelsPopup').style.display = 'none';
    }

    function selectChannel(channelName) {
            console.log('Selected channel:', channelName);
            listOfSelectedChannels.push(channelName);

            console.log(listOfSelectedChannels)
        }

function fetchChannels() {

        fetch('/rest/incident/channels')
            .then(response => response.json())
            .then(data => {
                var channelsList = document.getElementById('channelsList');
                channelsList.innerHTML = '';
                data.forEach(channel => {
                    var li = document.createElement('li');

                    var container = document.createElement('div');
                    container.style.display = 'flex';
                    container.style.alignItems = 'center';

                    var checkbox = document.createElement('input');
                    checkbox.type = 'checkbox';
                    checkbox.id = `channel-${channel.id}`;
                    checkbox.value = channel.channelName;
                    checkbox.onclick = function() {
                        selectChannel(channel.channelName);
                    };

                    var label = document.createElement('label');
                    label.htmlFor = `channel-${channel.id}`;
                    label.textContent = channel.channelName;

                    container.appendChild(checkbox);
                    container.appendChild(label);
                    li.appendChild(container);
                    channelsList.appendChild(li);
                });

                console.log(data);
            });
}


<!--function selectChannel(channel) {-->
<!--document.getElementById('selectedChannel').value = channel;-->
<!--document.getElementById('channelsPopup').style.display = 'none';-->
<!--}-->


    document.addEventListener('DOMContentLoaded', (event) => {
        document.getElementById("networkType").addEventListener('change', updateNetworkType);
        updateNetworkType(); // Call this initially to set the correct display on load
    });